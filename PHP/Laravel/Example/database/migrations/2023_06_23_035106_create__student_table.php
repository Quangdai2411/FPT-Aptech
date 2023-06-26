<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('Student', function (Blueprint $table) {
            $table->increments('MaSV');
            $table->string('TenSV')->default('not null');
            $table->string('LopHoc')->default('not null');
            $table->string('SoDienThoai');
            $table->string('Email');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('Student');
    }
};
