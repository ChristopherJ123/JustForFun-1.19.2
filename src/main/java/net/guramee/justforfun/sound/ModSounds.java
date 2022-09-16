package net.guramee.justforfun.sound;

import net.guramee.justforfun.JustForFun;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent TESSERACT_BREAK = registerSoundEvent("tesseract_break");
    public static SoundEvent TESSERACT_PLACE = registerSoundEvent("tesseract_place");
    public static SoundEvent AMOGUS_IDLE = registerSoundEvent("amogus_idle");

    public static final BlockSoundGroup TESSERACT_SOUNDS = new BlockSoundGroup(1f,1f,
            ModSounds.TESSERACT_BREAK, SoundEvents.BLOCK_STONE_STEP, ModSounds.TESSERACT_PLACE,
            SoundEvents.BLOCK_STONE_HIT, SoundEvents.BLOCK_STONE_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(JustForFun.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
