# GitHub Activity Tracker

## Description
A simple Java-based GitHub activity tracker that fetches repository details like stars, forks, commits, open issues, pull requests, and contributors using the GitHub API.

This tool helps repository owners, contributors, and developers track important repository statistics, analyze trends, and gather insights on their GitHub projects in an easy-to-understand format.

## Features
- **Monitor repository statistics**: Track stars, forks, open issues, watchers, and pull requests.
- **Fetch recent commits**: List recent commits and their details (author, message, and date).
- **Open Issues & Pull Requests**: Track open issues and pull requests, along with their details.
- **Contributors**: List contributors and their number of contributions to the repository.
- **Easy setup**: Simple to configure with just a GitHub Personal Access Token and minimal dependencies.

## Setup

### 1. Clone the Repository
Start by cloning this repository to your local machine:
```bash
git clone https://github.com/your_username/your_repository_name.git
cd your_repository_name
````

### 2. Set Up Your GitHub Personal Access Token

To interact with the GitHub API, you’ll need a GitHub **Personal Access Token** (PAT).

* **Generate your token**: Go to [GitHub's Personal Access Tokens](https://github.com/settings/tokens) and generate a new token with the following permissions:

  * `repo`
  * `read:user`
  * `public_repo`

Once generated, **keep the token safe**, as you'll need it to authenticate the app.

### 3. Run the GitHub Activity Tracker

In order to track GitHub activity, you'll need to run the `GitHubTracker.java` file with your GitHub credentials and repository details.

1. Open `GitHubTracker.java` and replace the following placeholders:

   * `your_personal_access_token`: Replace with your generated GitHub token.
   * `your_github_username`: Replace with your GitHub username.
   * `your_repository_name`: Replace with the name of the repository you want to track.

2. Compile and run the Java program:

   ```bash
   javac GitHubTracker.java
   java GitHubTracker
   ```

   Alternatively, you can run the program directly from your preferred **IDE** (e.g., IntelliJ IDEA, Eclipse, VS Code).

## Requirements

* **Java 8 or higher**
* **GitHub API Access Token** (generated from GitHub settings)
* **Internet connection** (to interact with GitHub API)

## Example Output

Here’s an example of what you can expect to see when the tracker runs successfully:

```
Repository: your_github_username/your_repository_name
Stars: 45
Forks: 12
Open Issues: 3
Watchers: 8

Recent Commits:
- John Doe: Added feature X on 2025-10-22
- Jane Smith: Fixed bug Y on 2025-10-21

Open Issues:
- Issue #1: Bug in feature X (Opened by john_doe)
- Issue #2: Feature Y request (Opened by jane_smith)

Open Pull Requests:
- PR #5: Add feature Z (Created by developer123)

Contributors:
- john_doe (Contributions: 10)
- jane_smith (Contributions: 5)
```

## Troubleshooting

* **Error: Unauthorized**: If you see an authentication error, make sure your GitHub Personal Access Token is set correctly and has the required scopes (`repo`, `read:user`, `public_repo`).
* **Rate Limiting**: GitHub API has rate limits. If you receive a rate limit error, wait for a while before trying again. GitHub’s rate limit for authentication is usually higher than for unauthenticated requests.

## Contributing

We welcome contributions to this project! If you have improvements or bug fixes, feel free to fork the repository and submit a pull request.

1. Fork this repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes and commit them.
4. Push to your fork (`git push origin feature/your-feature-name`).
5. Submit a pull request for review.

## License

This project is licensed under the **MIT License**. You are free to use, modify, and distribute the code as long as you adhere to the terms of the MIT License.

## About Noir Stack

This project utilizes the **Noir Stack**, a set of technologies optimized for building scalable and efficient applications. The **Noir Stack** combines lightweight Python libraries, efficient API usage, and performance-focused design to offer a seamless and effective way to monitor GitHub repository activities.

## License Summary

This project is licensed under the MIT License. For more details, see the LICENSE file in the repository.


