◆Spring MVCのHandlerInterceptorについてのメモ
※最低限の動きを確認したいため、入力チェック等はなし

◆概要
HandlerInterceptorは、Spring MVCのDispatcherServletによってリクエストが処理される段階で適用される。
具体的には以下の流れ。

１．DispatcherServletがHandlerMappingを使用してハンドラーを決定
２．InterceptorのpreHandle()が呼び出される
３．ハンドラー（Controller）が実行される
４．InterceptorのpostHandle()が呼び出される（正常終了時）
５．ビューのレンダリング後、afterCompletion()が呼び出される