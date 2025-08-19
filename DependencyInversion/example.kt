// BAD EXAMPLE
class NotesRepository {
    private val database = Room.databaseBuilder( /*...*/ ).build()

    fun saveNote(note: Note) {
        database.noteDao().insert(note)
    }
}

class NotesViewModel : ViewModel() {
    private val repository = NotesRepository()

    fun addNote(note: Note) {
        repository.saveNote(note)
    }
}
// NotesViewModel depends directly on NotesRepository
// NotesRepository depends directly on Room database (details)
// If you change the database implementation (e.g. switch to Firebase), you need to change both repository and viewModel
// Tight coupling = hard to test


// GOOD EXAMPLE

// 1. Define Abstraction
interface NotesDataSource {
    fun saveNote(note: Note)
}

// 2. Implement details
class RoomNotesDataSource(private val dao: NoteDao) : NotesDataSource {
    override fun saveNote(note: Note) {
        dao.insert(note)
    }
}

class FirebaseNotesDataSource(private val api: FirebaseApi) : NotesDataSource {
    override fun saveNote(note: Note) {
        api.upload(note)
    }
}

// 3. Use abstraction in repository
class NotesRepository(private val dataSource: NotesDataSource) {
    fun save(note: Note) = dataSource.saveNote(note)
}

// 4. Inject dependency in ViewModel
class NotesViewModel(private val repository: NotesRepository) : ViewModel() {
    fun addNote(note: Note) {
        repository.save(note)
    }
}