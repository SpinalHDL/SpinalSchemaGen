// SchemaGenVersion is defined in project/Version.scala

lazy val root = (project in file("."))
  .settings(
    name := "SpinalHDL Schemetic Generator",
    organization := "com.github.spinalhdl",
    version := SchemaGenVersion.major,
    crossScalaVersions := SchemaGenVersion.compilers,
    scalaVersion := SchemaGenVersion.compilers(0),

    Compile / scalaSource := baseDirectory.value / "schema" / "src" / "main",
    // Test / scalaSource := baseDirectory.value / "tester" / "src" / "main",

    libraryDependencies += "com.github.spinalhdl" %% "spinalhdl-core" % SchemaGenVersion.spinal,
    libraryDependencies += "com.github.spinalhdl" %% "spinalhdl-lib"  % SchemaGenVersion.spinal,
    libraryDependencies += "com.github.spinalhdl" %% "spinalhdl-tester"  % SchemaGenVersion.spinal,
    libraryDependencies += "org.scala-lang" % "scala-library" % scalaVersion.value,
    libraryDependencies += compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % SchemaGenVersion.spinal),
    libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.0",
    libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.0",
    libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.3.0",
    libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
  )

fork := true