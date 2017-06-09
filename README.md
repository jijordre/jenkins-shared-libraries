# Jenskins Shared Libraries

This repo contains shared library code that may be imported in Jenkins pipeline projects. Code herein is in many cases Statoil specific. It is suggested to transform boilerplate and/or repetitive snippets found in `Jenkinsfile` into e.g. global methods that may be invoked as _steps_ in declarative Jenkins pipelines. 

As starting point for documentation [Extending with Shared Libraries](https://jenkins.io/doc/book/pipeline/shared-libraries) is suggested. Another one, [Declarative Pipeline: Notifications and Shared Libraries](https://jenkins.io/blog/2017/02/15/declarative-notifications), nicely outlines the usage of shared libraries in a declarative pipeline context.