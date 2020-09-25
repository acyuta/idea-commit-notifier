package com.github.acyuta.ideacommitnotifier.services

import com.intellij.openapi.project.Project
import com.github.acyuta.ideacommitnotifier.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
