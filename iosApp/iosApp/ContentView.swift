import SwiftUI
import shared

class ViewModel : ObservableObject{
    @Published
    var content: String = "Carregando..."

    func load() -> Void {
        NativeGreeting().onGreeting { [weak self] result in
           self?.content = result
       }
    }
}

struct ContentView: View {
	@ObservedObject
	var viewModel = ViewModel()

	var body: some View {
		Text(viewModel.content).onAppear { viewModel.load() }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
