package com.littlelemon.networkscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
        private val _isSearching = MutableStateFlow(false)
        val isSearching = _isSearching.asStateFlow()

        private val _searchText = MutableStateFlow("")
        val searchText = _searchText.asStateFlow()

        fun onSearchTextChange(text: String) {
                _searchText.value = text
        }

        fun onToogleSearch() {
                _isSearching.value = !_isSearching.value
                if (!_isSearching.value) {
                        onSearchTextChange("")
                }
        }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NetwSearchBar(){
        val viewModel = MainViewModel()
        val searchText by viewModel.searchText.collectAsState()
        val isSearching by viewModel.isSearching.collectAsState()

        SearchBar(
                query = searchText,
                onQueryChange = viewModel::onSearchTextChange,
                onSearch = viewModel::onSearchTextChange,
                active = isSearching,
                onActiveChange = { viewModel.onToogleSearch()},
                leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
                placeholder = {Text(text = "Search", modifier = Modifier.padding(0.dp))},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                        .padding(start = 18.dp, top = 14.dp, bottom = 14.dp)
                        .size(height = 40.dp, width = 360.dp)

        ){
        }
}