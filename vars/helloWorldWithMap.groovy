def call (Map config = [:]) {
sh "echo Hello Name is ${config.name}, Today is ${config.dayOfWeek}"
}
