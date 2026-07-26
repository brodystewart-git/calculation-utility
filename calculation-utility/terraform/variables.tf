variable "image_name" {
  type        = string
  default     = "calculation-utility:latest"
  description = "Name for the image"
}

variable "container_name" {
  type        = string
  default     = "calculation-utility"
  description = "Name for the container"
}