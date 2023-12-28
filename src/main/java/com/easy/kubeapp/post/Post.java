package com.easy.kubeapp.post;

import lombok.EqualsAndHashCode;
import lombok.Value;

public record Post(Integer id, String title, String content) {
}
