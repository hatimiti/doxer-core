lombokを利用しているので下記の手順が必要

1．パッケージ・エクスプローラ→Gradle Dependencies→lombok.jarを右クリック→実行→Main
2．対象のIDEに対してlombokをインストール
3．IDE起動時に -vmargs -Xbootclasspath:a:lombok.jar -javaagent:lombok.jar を追加