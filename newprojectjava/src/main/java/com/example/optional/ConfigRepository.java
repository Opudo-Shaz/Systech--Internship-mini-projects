package com.example.optional;

import java.util.Optional;

public class ConfigRepository extends Repository<Config, String> {

    // Simulated in-memory storage for configurations
    public Optional<Config> getCurrentConfig(Long configId) {
        // Simulate fetching configuration, which may or may not be present
        Config config = null; // Simulating a missing configuration
        System.out.println("Fetching current configuration...");
        return Optional.ofNullable(config);
    }
    
}
