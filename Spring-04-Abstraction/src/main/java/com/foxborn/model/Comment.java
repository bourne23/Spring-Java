package com.foxborn.model;

import lombok.Data;

// Pojos dont get @Component
@Data // @getter, @setter, @toString, @equals, @hashCode, and @NoArgsConstructor
public class Comment {      // 1.  create comment object first - what we are sending via email or push notif. Has no dependencies, and is not a dependency
    private String author;
    private String text;
}
