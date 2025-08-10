// WRONG APROUCH
open class MediaPlayer {
    open fun play(file: String) {
        println("Playing $file")
    }
}

class AudioPlayer : MediaPlayer()

class VideoPlayer : MediaPlayer() {
    override fun play(file: String) {
        if (!file.endsWith(".mp4")) {
            throw UnsupportedOperationException("VideoPlayer can only play video files!")
        }
        println("Playing video $file")
    }
}

// VideoPlayer can cause issues if used where MediaPlayer is expected, beacause it overrides the play method with a restriction.

// CORRECT APPROACH (Liskov Substitution Principle)
open class MediaPlayer {
    open fun play(file: String) {
        println("Playing $file")
    }
}

class AudioPlayer : MediaPlayer() {
    override fun play(file: String) {
        println("Playing audio $file")
    }
}

class VideoPlayer : MediaPlayer() {
    override fun play(file: String) {
        println("Playing video $file")
    }
}

// All subclasses still respect the parent’s promise: they can play whatever file they’re given.