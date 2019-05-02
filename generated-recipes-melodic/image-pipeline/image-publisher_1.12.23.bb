# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "<p>       Contains a node publish an image stream from single image file       or avi motion file.     </p>"
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/image_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "image_publisher"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_publisher/1.12.23-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6d4788470d40c8b34ef16bf680b5be38"
SRC_URI[sha256sum] = "56bebe095951f6cfb7e0d4c0250ed2dea459b085b214b9e21cdd93f4878efa4a"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_publisher-1.12.23-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/image-pipeline/image-pipeline_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/image-pipeline/image-pipeline_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/image-pipeline-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
