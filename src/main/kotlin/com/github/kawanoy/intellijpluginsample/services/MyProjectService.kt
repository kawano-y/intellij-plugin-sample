package com.github.kawanoy.intellijpluginsample.services

import com.intellij.openapi.project.Project
import com.github.kawanoy.intellijpluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
