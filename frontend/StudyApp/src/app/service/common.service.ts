import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StudyInfo } from '../model/stydyInfo';
import { SectionInfo } from '../model/sectionInfo';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  /**
   * <dl>
   * <dt><b>メソッド概要:</b></dt>
   * <dd>デフォルトコンストラクタ</dd>
   * </dl>
   *
   * @param http HTTP通信オブジェクト
   */
  constructor(private http: HttpClient) { }

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>勉強会情報取得</dd>
   * </dl>
   *
   */
  getStudyInfo(): Observable<StudyInfo> {
    return this.http.get<StudyInfo>(environment.studyinfo_url);
  }

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>セクション情報取得</dd>
   * </dl>
   *
   * @param id セクションID
   */
  getSectionInfo(id: string): Observable<SectionInfo> {
    return this.http.get<SectionInfo>(environment.sectioninfo_url + id);
  }
}
