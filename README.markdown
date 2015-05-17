Ant + Ivy
==========

## 試した環境

- Apache Ant(TM) version 1.8.2 compiled on June 20 2012
- Apache Ivy 2.4.0 - 20141213170938 :: http://ant.apache.org/ivy/


## 実行

Ivyのjarを指定すること。Antがデフォルトで参照するディレクトリに入れておいてもよい。

```
ant -lib /usr/local/Cellar/ivy/2.4.0/libexec/ivy-2.4.0.jar clean test
```