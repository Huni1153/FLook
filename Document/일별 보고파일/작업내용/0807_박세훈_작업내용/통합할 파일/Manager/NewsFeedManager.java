package Manager;

import java.util.ArrayList;
import java.util.HashMap;

import ViewDAO.FollowCommentRecipeViewDAO;
import ViewDAO.FollowLikeRecipeViewDAO;
import ViewDAO.FollowScrapViewDAO;
import ViewDAO.FollowWrittenRecipeViewDAO;
import ViewDAO.NewsfeedLatestOrderViewDAO;
import ViewVO.FollowCommentRecipeViewVO;
import ViewVO.FollowLikeRecipeViewVO;
import ViewVO.FollowScrapViewVO;
import ViewVO.FollowWrittenRecipeViewVO;
import ViewVO.NewsfeedLatestOrderViewVO;

public class NewsFeedManager {
	private NewsfeedLatestOrderViewDAO newsFeedLatestOrderViewDAO;
	private FollowLikeRecipeViewDAO followLikeRecipeViewDAO;
	private FollowWrittenRecipeViewDAO followWrittenRecipeViewDAO;
	private FollowScrapViewDAO followScrapViewDAO;
	private FollowCommentRecipeViewDAO followCommentRecipeViewDAO;

	public NewsFeedManager() {
		this.newsFeedLatestOrderViewDAO = NewsfeedLatestOrderViewDAO.getInstance();
	}

	// public requestNewsFeedList(){}
	public ArrayList<NewsfeedLatestOrderViewVO> requestLatestOrder(String postCode) {
		ArrayList<NewsfeedLatestOrderViewVO> array = this.newsFeedLatestOrderViewDAO.searchNewsfeedInLatestOrder(0);
		return array;
	}

	public ArrayList<Object> requestPopularOrder(String date) {
		HashMap<String, FollowLikeRecipeViewVO> likeMap = followLikeRecipeViewDAO.searchNewsFeedPopularOrder(null);
		HashMap<String, FollowWrittenRecipeViewVO> writtenMap = followWrittenRecipeViewDAO
				.searchFollowWrittenRecipe(null);
		HashMap<String, FollowScrapViewVO> scrapMap = followScrapViewDAO.searchFollowScrap(null);
		HashMap<String, FollowCommentRecipeViewVO> commentMap = followCommentRecipeViewDAO
				.searchFollowCommentRecipe(null);

		ArrayList<Object> popularPosts = sort(likeMap, writtenMap, scrapMap, commentMap);
		return popularPosts;
	}

	private ArrayList<Object> sort(HashMap<String, FollowLikeRecipeViewVO> likeMap,
			HashMap<String, FollowWrittenRecipeViewVO> writtenMap, HashMap<String, FollowScrapViewVO> scrapMap,
			HashMap<String, FollowCommentRecipeViewVO> commentMap) {
		ArrayList<Object> popularPosts = new ArrayList<Object>();

		for (int i = 0; i < likeMap.size(); i++) {
			popularPosts.add(likeMap.get(i + 1 + ""));
		}
		for (int i = 0; i < writtenMap.size(); i++) {
			popularPosts.add(writtenMap.get(i + 1 + ""));
		}
		for (int i = 0; i < scrapMap.size(); i++) {
			popularPosts.add(scrapMap.get(i + 1 + ""));
		}
		for (int i = 0; i < commentMap.size(); i++) {
			popularPosts.add(commentMap.get(i + 1 + ""));
		}
		
		return null;
		/*Object[] stringArrayPosts = popularPosts.toArray();
		int number = stringArrayPosts.length;
		quicksort(0, number - 1, stringArrayPosts);*/
	}

	/*private void quicksort(int low, int high, Object[]numbers) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high - low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}*/

	public static void main(String[] args) {
		NewsFeedManager manager = new NewsFeedManager();
		ArrayList<NewsfeedLatestOrderViewVO> array = manager.requestLatestOrder(null);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getPostCode());
		}
	}
}
