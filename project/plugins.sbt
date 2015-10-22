// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// The bblfish.net repository
resolvers += "bblfish.net repository" at "http://bblfish.net/work/repo/releases/"

resolvers += Resolver.url("bblfish ivy repository",url("http://bblfish.net/work/repo/ivy/releases/"))(Resolver.ivyStylePatterns)

// Use the Play sbt plugin for Play projects ( the 2.3.7-TLS plugin still works for 2.3.11-TLS )
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.11-TLS")

//resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

//addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

//resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

