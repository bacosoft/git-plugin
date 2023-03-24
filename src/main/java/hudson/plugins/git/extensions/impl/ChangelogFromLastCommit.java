package hudson.plugins.git.extensions.impl;

import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.plugins.git.extensions.GitSCMExtension;
import hudson.plugins.git.extensions.GitSCMExtensionDescriptor;

/**
 * This extension activates the alternative changelog computation,
 * where the changelog is calculated from last commit.
 *
 * @author enrico
 */
public class ChangelogFromLastCommit extends GitSCMExtension {

    @DataBoundConstructor
    public ChangelogFromLastCommit() {
    }

    @Extension
    @Symbol("changelogFromLastCommit")
    public static class DescriptorImpl extends GitSCMExtensionDescriptor {

        @Override
        public String getDisplayName() {
            return "Calculate changelog against last commit";
        }
    }
}
