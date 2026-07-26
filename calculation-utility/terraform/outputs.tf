output "container_id" {
  value       = docker_container.calc_container.id
  description = "ID of the container"
}

output "container_name" {
  value       = docker_container.calc_container.name
  description = "Name of the container"
}