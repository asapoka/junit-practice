# JUnit5 の練習

## mvn でプロジェクトを作成

```zsh
mvn archetype:generate
```

### 色々聞かれるので答える

```zsh
Choose a number or apply filter
```

グループ ID の指定 → よくわからないので未指定

```zsh
Choose org.apache.maven.archetypes:maven-archetype-quickstart version:
```

mvn のバージョンを聞かれている？ → 最新を選ぶ（デフォルト）

```zsh
Define value for property ‘groupId’::
```

プロジェクトのグループ ID を聞かれている → パッケージ名を入力

→com.asapoka

```zsh
Define value for property ‘version’: 1.0-SNAPSHOT::
```

バージョン名を聞かれている → 一旦デフォルト

```zsh
Define value for property ‘package’:
```

さっき入力したパッケージ名が設定されているのでデフォルト Enter

最後に内容確認されるので Y

## mvn によるビルド

```zsh
cd ${プロジェクトディレクトリ}
mvn install
```

とりあえずこれで必要なライブラリ取得、ビルドを実行する
