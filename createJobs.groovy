pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('taskService') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Georgyi1982Fox/springboot-jenkins-sample.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
