enablePlugins(ScalaJSPlugin)

name := "scalajs deno example"
scalaVersion := "2.13.4" // or any other Scala version >= 2.10.2

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// ECMAScript
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }
// CommonJS
//scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "1.1.0"
  //,
  //"io.scalajs" %%% "nodejs" % "0.5.0"
)

/*
resolvers ++= Seq(
   Resolver.typesafeIvyRepo("releases"),
   Resolver.typesafeRepo("releases"),
   DefaultMavenRepository,
   Resolver.sonatypeRepo("public"),
   Resolver.sonatypeRepo("releases"),
   Resolver.jcenterRepo
)
 */
