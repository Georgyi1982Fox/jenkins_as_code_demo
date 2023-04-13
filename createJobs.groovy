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
                        url 'https://github.com/Georgyi1982Fox/taskservice_new.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
