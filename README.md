A lightweight, efficient utility designed to perform [specific calculation type] with a focus on containerized deployment and automated CI/CD pipelines.

🛠️ Tech Stack Language: Java Orchestration/Deployment: Kubernetes Containerization: Docker Automation: Jenkins (or GitHub Actions) Build Tool: Maven

🚀 Key Features [Feature 1]: Simple fibonacci sequence function designed to simply print out an answer. The program itself is simple as it's meant more to display my ability with DevOps tools.

DevOps-Ready: Fully containerized environment for consistent performance across local and production environments.

⚙️ DevOps & Automation Orchestration: Contains a deployment.yaml file allowing for easy pod deployment with Kubernetes.

Containerized Deployment: The project includes a Dockerfile allowing for seamless deployment and testing in isolated environments.

CI/CD Pipeline: Configured with a Jenkinsfile (or GitHub Actions workflow) to automate the build and testing process, ensuring code quality with every commit.

🏁 How to Run (Local) Prerequisites: Docker Engine and kubectl must be installed and configured.

Clone the repository: git clone https://github.com/brodystewart-git/calculation-utility/tree/master

Build the Docker Image: docker build -t calc-utility .

Run the container: docker run -it calc-utility

Architecture Notes: This utility was built to demonstrate a modern, cloud-native workflow. By utilizing a multi-stage Dockerfile, the final image is optimized for size and security, while the deployment.yaml ensures high availability and scalability within a Kubernetes cluster.
