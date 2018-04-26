package org.ricardo.example.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ExamplePlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create("exampleTask", PluginData.class, (task) -> {
            task.setData("Plugin has set this default message");
        }); 
    }
}