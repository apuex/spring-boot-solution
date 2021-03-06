import java.io.File

import Dependencies._

name := "java-runtime"
scalaVersion := scalaVersionNumber
organization := artifactGroupName
version      := artifactVersionNumber

libraryDependencies ++= Seq(
  protobufJava,
  protobufJavaUtil,
  jodaTime,
  cassandraDriver,
  slf4jApi % Test,
  slf4jSimple % Test,
  scalaTest % Test
)

protobufProtocOptions in ProtobufConfig ++= { // if a java target is provided, add java generation option
  (resourceDirectory in Compile).value match {
    case f: File =>
      if(!f.exists())f.mkdirs()
      Seq(s"--descriptor_set_out=%s/${name.value}-${artifactVersionNumber}.protobin".format(f.getCanonicalPath))
  }
}

publishTo := sonatypePublishTo.value
