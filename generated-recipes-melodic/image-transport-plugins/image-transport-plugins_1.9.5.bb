# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics     in representations other than raw pixel data. For example, for viewing a     stream of images off-robot, a video codec will give much lower bandwidth     and latency. For low frame rate tranport of high-definition images, you     might prefer sending them as JPEG or PNG-compressed form."
AUTHOR = "David Gossow <dgossow@willowgarage.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/image_transport_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_transport_plugins"
ROS_BPN = "image_transport_plugins"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    compressed-depth-image-transport \
    compressed-image-transport \
    theora-image-transport \
"

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

SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/melodic/image_transport_plugins/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "48eff7e9620d983b4432a3f0f8c999fc"
SRC_URI[sha256sum] = "1838bdad50e903b572a00fcb66935326e81c5e706af3356a64c0322927361ecd"
S = "${WORKDIR}/image_transport_plugins-release-release-melodic-image_transport_plugins-1.9.5-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('image-transport-plugins', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('image-transport-plugins', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-transport-plugins/image-transport-plugins_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-transport-plugins/image-transport-plugins-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-transport-plugins/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-transport-plugins/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
