# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Transports audio from a source to a destination. Audio sources can come       from a microphone or file. The destination can play the audio or save it       to an mp3 file."
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/audio_capture"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

ROS_BPN = "audio_capture"

ROS_BUILD_DEPENDS = " \
    audio-common-msgs \
    libgstreamer-plugins-base1.0-dev \
    libgstreamer1.0-dev \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    audio-common-msgs \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-ugly \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    audio-common-msgs \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-ugly \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_capture/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "952046920adf51bfaedef5ef93fe1ed7"
SRC_URI[sha256sum] = "c24552309d44459372bb344e5d02af47ce6f9451329cb1f73e99e57833d734cb"
S = "${WORKDIR}/audio_common-release-release-melodic-audio_capture-0.3.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/audio-common/audio-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/audio-common/audio-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/audio-common/audio-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/audio-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/audio-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
