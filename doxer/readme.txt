■lombokを利用しているので下記の手順が必要

1．パッケージ・エクスプローラ→Gradle Dependencies→lombok.jarを右クリック→実行→Main
2．対象のIDEに対してlombokをインストール
3．IDE起動時に -vmargs -Xbootclasspath:a:lombok.jar -javaagent:lombok.jar を追加

■spring-loadedの利用方法
サーバーのVM起動引数に追加
 -javaagent:${resource_loc:/doxer/.lib/springloaded-1.2.0.RELEASE.jar} -noverify
 
 
●Spring-Bootによる起動時は
・/WebContent/WEB-INF/web.xml, applicationContext.xml, dispatcher-servlet.xmlは使用しません。
・Spring-Boot用に/WebContent/WEB-INF/view -> /src/main/resources/templates の拡張フォルダ(リンク)を貼っています
・Spring-Bootを使用しない場合はControllerの返り値のhtmlへのパスには「.html」を付加します。(どこかで修正したい)