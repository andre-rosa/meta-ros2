# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics     in representations other than raw pixel data. For example, for viewing a     stream of images off-robot, a video codec will give much lower bandwidth     and latency. For low frame rate tranport of high-definition images, you     might prefer sending them as JPEG or PNG-compressed form."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
HOMEPAGE = "http://www.ros.org/wiki/image_transport_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "image_transport_plugins"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    compressed-depth-image-transport \
    compressed-image-transport \
    theora-image-transport \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/crystal/image_transport_plugins/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ba901819e08a72d29ce1c4008817fd84"
SRC_URI[sha256sum] = "31adddd619d0be5f1561ae22d965b98da156ee9b5f0bfa0d7f06534c7eb743cc"
S = "${WORKDIR}/image_transport_plugins-release-release-crystal-image_transport_plugins-2.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('image-transport-plugins', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/image-transport-plugins_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/image-transport-plugins-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
