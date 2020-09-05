package com.github.bxvs888.pandoraassistant.services

import com.intellij.openapi.project.Project
import com.github.bxvs888.pandoraassistant.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
