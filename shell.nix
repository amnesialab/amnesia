{ pkgs ? import <nixpkgs> {} }:

with pkgs;

stdenv.mkDerivation {
  name = "amnesialab.io";

  buildInputs = [
    automake
    jekyll
    ruby
    simpleBuildTool
  ];
}