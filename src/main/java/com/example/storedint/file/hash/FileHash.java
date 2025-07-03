package com.example.storedint.file.hash;

import com.example.storedint.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
