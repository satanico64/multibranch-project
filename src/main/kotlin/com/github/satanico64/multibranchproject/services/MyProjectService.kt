package com.github.satanico64.multibranchproject.services

import com.github.satanico64.multibranchproject.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
