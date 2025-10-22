import org.kohsuke.github.GHCommit;
import org.kohsuke.github.GHContributor;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;

public class GitHubTracker {

    public static void main(String[] args) {
        String token = "your_personal_access_token";  // Replace with your GitHub Personal Access Token
        String repoOwner = "your_github_username";  // Replace with the repository owner's GitHub username
        String repoName = "your_repository_name";  // Replace with the repository name

        try {
            // Authenticate to GitHub using the personal access token
            GitHub github = GitHub.connectUsingOAuth(token);
            GHRepository repo = github.getRepository(repoOwner + "/" + repoName);

            // Print general repository stats
            System.out.println("Repository: " + repo.getFullName());
            System.out.println("Stars: " + repo.getStargazersCount());
            System.out.println("Forks: " + repo.getForksCount());
            System.out.println("Open Issues: " + repo.getOpenIssueCount());
            System.out.println("Watchers: " + repo.getSubscribersCount());

            // Print recent commits
            System.out.println("\nRecent Commits:");
            List<GHCommit> commits = repo.listCommits().asList();
            for (int i = 0; i < Math.min(commits.size(), 5); i++) {
                GHCommit commit = commits.get(i);
                System.out.println("- " + commit.getCommitter().getName() + ": " + commit.getCommitShortMessage() + " on " + commit.getCommitDate());
            }

            // Print open issues
            System.out.println("\nOpen Issues:");
            List<GHIssue> issues = repo.getIssues(GHIssue.State.OPEN);
            for (GHIssue issue : issues) {
                System.out.println("- " + issue.getTitle() + " (Opened by " + issue.getUser().getLogin() + ")");
            }

            // Print open pull requests
            System.out.println("\nOpen Pull Requests:");
            List<GHPullRequest> pullRequests = repo.getPullRequests(GHPullRequest.State.OPEN);
            for (GHPullRequest pr : pullRequests) {
                System.out.println("- " + pr.getTitle() + " (Created by " + pr.getUser().getLogin() + ")");
            }

            // Print contributors
            System.out.println("\nContributors:");
            List<GHContributor> contributors = repo.getContributors();
            for (GHContributor contributor : contributors) {
                System.out.println("- " + contributor.getLogin() + " (Contributions: " + contributor.getContributions() + ")");
            }

        } catch (IOException e) {
            System.err.println("Error interacting with GitHub API: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
