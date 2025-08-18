// WRONG APPROACH
interface MediaControls {
    fun playAudio()
    fun playVideo()
    fun recordAudio()
    fun recordVideo()
}

class MusicPlayer : MediaControls {
    override fun playAudio() { /* works */ }
    override fun playVideo() {
        throw UnsupportedOperationException("Music player can't play video")
    }
    override fun recordAudio() {
        throw UnsupportedOperationException("Not supported")
    }
    override fun recordVideo() {
        throw UnsupportedOperationException("Not supported")
    }
}
// MusicPlayer is forced to implement methods that it doesn't need



// RIGHT APPROACH
interface AudioPlayable {
    fun playAudio()
}

interface VideoPlayable {
    fun playVideo()
}

interface AudioRecordable {
    fun recordAudio()
}

interface VideoRecordable {
    fun recordVideo()
}

class MusicPlayer : AudioPlayable {
    override fun playAudio() { /* works */ }
}

class VideoPlayer : VideoPlayable {
    override fun playVideo() { /* works */ }
}

class VoiceRecorder : AudioRecordable {
    override fun recordAudio() { /* works */ }
}