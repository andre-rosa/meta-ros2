# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package retrieves data from url-format files such as http://,    ftp://, package:// file://, etc., and loads the data into memory.    The package:// url for ros packages is translated into a local    file:// url.  The resourse retriever was initially designed to load    mesh files into memory, but it can be used for any type of    data. The resource retriever is based on the the libcurl library."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
ROS_AUTHOR = "Josh Faust <jfaust@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/resource_retriever"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "resource_retriever"
ROS_BPN = "resource_retriever"

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

SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/bouncy/resource_retriever/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "757a9211721333c0b023ae1d0f03bb6f"
SRC_URI[sha256sum] = "d1f341d535a07eb7b137cc3ba35879ad9e3549d6b37770f696c4c17d06379e2b"
S = "${WORKDIR}/resource_retriever-release-release-bouncy-resource_retriever-2.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('resource-retriever', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('resource-retriever', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/resource-retriever_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/resource-retriever-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/resource-retriever/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
