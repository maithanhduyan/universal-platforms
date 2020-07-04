<h5 class="my-4">{{__('shop.category_list')}}</h5>
<div class="list-group">
    @if(Product::countCategory()>0)
    @foreach(Product::getCategory() as $item)
    <a href="/{{$item->short_name}}" class="list-group-item"> {{$item->name}}</a>
    @endforeach
    @endif
</div>