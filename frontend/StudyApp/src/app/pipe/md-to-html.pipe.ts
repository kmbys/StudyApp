import { Pipe, PipeTransform } from '@angular/core';
import * as marked from 'marked';

@Pipe({
  name: 'mdToHtml'
})
export class MdToHtmlPipe implements PipeTransform {

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>値をmarkdownに変換する</dd>
   * </dl>
   *
   * @param value 値
   * @param args 引数
   */
  transform(value: any, ...args: any[]): any {
    if (value === undefined || value === null) {
      return;
    }
    return marked(value);
  }

}
