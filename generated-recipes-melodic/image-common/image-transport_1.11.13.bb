# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "image_transport should always be used to subscribe to and publish images. It provides transparent      support for transporting images in low-bandwidth compressed formats. Examples (provided by separate      plugin packages) include JPEG/PNG compression and Theora streaming video."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://ros.org/wiki/image_transport"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_common"
ROS_BPN = "image_transport"

ROS_BUILD_DEPENDS = " \
    message-filters \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-filters \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-filters \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/melodic/image_transport/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2035824dcdb07482cf2c65137d32c2b4"
SRC_URI[sha256sum] = "070c49d03d5320c322237672d62c34b3fd3f8c4b311a76f3572894f368421d55"
S = "${WORKDIR}/image_common-release-release-melodic-image_transport-1.11.13-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('image-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('image-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-common/image-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-common/image-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
