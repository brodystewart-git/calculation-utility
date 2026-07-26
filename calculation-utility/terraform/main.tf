terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 3.0.0"
    }
  }
}

provider "docker" {}

resource "docker_image" "calc_image" {
  name         = var.image_name
  keep_locally = true
}

resource "docker_container" "calc_container" {
  name     = var.container_name
  image    = docker_image.calc_image.image_id
  must_run = false
}