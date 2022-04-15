var longestPalindrome = function(s) {
	let currentLongest = "";
	let index = 0;

	while (index < s.length) {
		var first = computePalindrome(index - 1, index, s, "");
		var second = computePalindrome(index - 1, index + 1, s, s[index]);
		var third = computePalindrome(index, index + 1, s, "");

		if (first.length > currentLongest.length) currentLongest = first;
		if (second.length > currentLongest.length) currentLongest = second;
		if (third.length > currentLongest.length) currentLongest = third;
		index++;
	}

	return currentLongest;
};

var computePalindrome = function(start, end, s, palindrome) {
	while (start >= 0 && end < s.length) {
		if (s[start] === s[end]) {
			palindrome = s[start] + palindrome;
			palindrome = palindrome + s[end];
			start--;
			end++;
			continue;
		}

		break;
	}

	return palindrome;
};
