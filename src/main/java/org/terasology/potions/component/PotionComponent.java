/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.potions.component;

import com.google.common.collect.Lists;
import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

import java.util.List;

public final class PotionComponent implements Component {
    public String effect;
    public float magnitude;
    public long duration;
    public boolean hasGenome = true; // If a potion has been predefined by a developer, set this to false.

    // List of PotionEffects.
    @Replicate
    public List<PotionEffect> effects = Lists.newArrayList();
}