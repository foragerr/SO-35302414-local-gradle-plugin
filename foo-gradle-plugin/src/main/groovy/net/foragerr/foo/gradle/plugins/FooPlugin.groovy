package net.foragerr.foo.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging

/**
 * Created by @author foragerr@gmail.com
 */
class FooPlugin implements Plugin<Project>{
    protected final Logger log = Logging.getLogger(getClass());
    void apply(Project project){
		println 'FOOOOOOO!'
    }
}
