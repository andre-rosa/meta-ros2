# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Theora_image_transport provides a plugin to image_transport for     transparently sending an image stream encoded with the Theora codec."
AUTHOR = "Julius Kammerl <jkammerl@willowgarage.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/image_transport_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_transport_plugins"
ROS_BPN = "theora_image_transport"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    libogg \
    libtheora \
    message-generation \
    pluginlib \
    rosbag \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    libogg \
    libtheora \
    message-runtime \
    pluginlib \
    rosbag \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    libogg \
    libtheora \
    message-runtime \
    pluginlib \
    rosbag \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/melodic/theora_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ac5183cb0b66ec99a9f9541dceb05bf7"
SRC_URI[sha256sum] = "03701fa45f64b4642eb8b7720662363bb10c4f20e32da2783c595258fc3eaced"
S = "${WORKDIR}/image_transport_plugins-release-release-melodic-theora_image_transport-1.9.5-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('image-transport-plugins', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('image-transport-plugins', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/image-transport-plugins_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/image-transport-plugins-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-transport-plugins/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
