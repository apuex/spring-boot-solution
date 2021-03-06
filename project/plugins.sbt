addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.20")
addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.4.0")

addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.6.3")

// publish to sonatype ossr
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.20")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.9.0-M5"
