package org.ricardo.example.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class PluginData extends DefaultTask {
    private String data;

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    @TaskAction
    void sayGreeting() {
        System.out.println("Plugin executed its task, data is: "+data); 
    }
}