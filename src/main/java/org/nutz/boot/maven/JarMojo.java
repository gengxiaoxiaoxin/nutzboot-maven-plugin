package org.nutz.boot.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="jar")
public class JarMojo extends AbstractNbMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        throw new MojoFailureException("not done yet");
    }

}
