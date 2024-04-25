package ayush.ggv.instau.presentation.auth.signup

import androidx.compose.runtime.Composable
import ayush.ggv.instau.presentation.destinations.HomeDestination
import ayush.ggv.instau.presentation.destinations.LoginDestination
import ayush.ggv.instau.presentation.destinations.SignUpNDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Composable
@Destination
fun SignUpN(
    navigator: DestinationsNavigator
) {
    val viewModel : SignUpViewModel = koinViewModel()

    SignUpScreen(
        uiState = viewModel.uiState,
        onUsernameChange = viewModel::updateUsername,
        onEmailChange = viewModel::updateEmail,
        onPasswordChange = viewModel::updatePassword,
        onNavigateToLogin = {
            navigator.navigate(LoginDestination){
                popUpTo(SignUpNDestination.route){inclusive = true}

            }
        },
        onNavigateToHome = {
            navigator.navigate(HomeDestination){
                popUpTo(SignUpNDestination.route){inclusive = true}
            }        },
        onSignupClick = viewModel::signUp

    )
}