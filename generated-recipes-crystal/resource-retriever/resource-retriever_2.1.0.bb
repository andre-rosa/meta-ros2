# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package retrieves data from url-format files such as http://,    ftp://, package:// file://, etc., and loads the data into memory.    The package:// url for ros packages is translated into a local    file:// url.  The resourse retriever was initially designed to load    mesh files into memory, but it can be used for any type of    data. The resource retriever is based on the the libcurl library."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/resource_retriever"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    libcurl-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    libcurl-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    libcurl-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/crystal/resource_retriever/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "734237c4a14e90216776fbb5887a8a37"
SRC_URI[sha256sum] = "9db42f615c9c1240dcae2f0ef91495e1177ab7c97acd884dfb38507e5d41660b"
S = "${WORKDIR}/resource_retriever-release-release-crystal-resource_retriever-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/resource-retriever-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
