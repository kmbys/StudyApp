import { Component, OnInit, Input } from '@angular/core';
import { CommonService } from './service/common.service';
import { SectionInfo } from './model/sectionInfo';

/**
 * <dl>
 * <dt>クラス機能概要: </dt>
 * <dd>ルートコンポーネント</dd>
 * </dl>
 *
 */
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  private title: string;

  @Input()
  private sectionInfos: SectionInfo[];

  @Input()
  private index;

  /**
   * <dl>
   * <dt>メソッド概要: </dt>
   * <dd>デフォルトコンストラクタ</dd>
   * </dl>
   *
   * @param commonService 共通サービス
   */
  constructor(private commonService: CommonService) {
  }

  /**
   * <dl>
   * <dt>メソッド概要: </dt>
   * <dd>初期化</dd>
   * </dl>
   *
   */
  ngOnInit() {
    this.title = '';
    this.index = 0;
    this.sectionInfos = [];
    this.commonService.getStudyInfo().subscribe(studyInfo => {
      this.title = studyInfo.name;
      studyInfo.sectionIds.forEach(id => {
        this.commonService.getSectionInfo(id).subscribe(sectionInfo => {
          this.sectionInfos.push(sectionInfo);
        });
      });
    });
  }

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>子コンポーネントから値を授受する</dd>
   * </dl>
   *
   * @param eventData イベントデータ
   */
  onReceiveEventFromChild(eventData: number) {
    this.index = eventData;
  }
}
